package Clases;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

public class Exportar {

    // Establece el look and feel para mejorar la apariencia
    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para exportar a Excel
    public void exportarExcel(JTable t) throws IOException {
        setLookAndFeel();  // Cambia el look and feel antes de mostrar cualquier GUI

        // Crea el JFileChooser para seleccionar el archivo
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setApproveButtonText("Guardar");
        chooser.setFileFilter(new FileNameExtensionFilter("Archivos de Excel (*.xls)", "xls"));
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));  // Establece la carpeta inicial

        // Muestra el cuadro de diálogo para guardar el archivo
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");

            File archivoXLS = new File(ruta);
            if (archivoXLS.exists()) { // comprueba si existe ya el archivo
                int opcion = JOptionPane.showConfirmDialog(null,
                        "El archivo ya existe. ¿Deseas sobreescribirlo?",
                        "Confirmar sobreescritura",
                        JOptionPane.YES_NO_OPTION);
                if (opcion != JOptionPane.YES_OPTION) {
                    return;  // Si el usuario no acepta, no se sobreescribe el archivo
                }
            }

            // Se crea el FileOutputStream fuera del bloque try
            FileOutputStream archivo = null;
            HSSFWorkbook libro = null;
            try {
                // Crea el archivo Excel y la hoja de trabajo
                archivo = new FileOutputStream(archivoXLS);
                libro = new HSSFWorkbook();
                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);  // Desactiva las líneas de la cuadrícula

                // Crea un estilo de celda para los encabezados
                CellStyle estiloEncabezado = libro.createCellStyle();
                Font fuenteEncabezado = libro.createFont();
                fuenteEncabezado.setBoldweight((short) 700);  // Cambiado a setBoldweight con Font.BOLD
                estiloEncabezado.setFont(fuenteEncabezado);

                // Crea la fila de encabezado una sola vez, fuera del bucle
                Row filaEncabezado = hoja.createRow(0);

                // Coloca los encabezados de las columnas
                for (int c = 0; c < t.getColumnCount(); c++) {
                    Cell celdaEncabezado = filaEncabezado.createCell(c);
                    celdaEncabezado.setCellValue(t.getColumnName(c)); // Asigna el nombre de la columna
                    celdaEncabezado.setCellStyle(estiloEncabezado); // Aplica el estilo del encabezado
                }
                for (int c = 0; c < t.getColumnCount(); c++) {
                    hoja.autoSizeColumn(c);
                    hoja.setColumnWidth(c, hoja.getColumnWidth(c) + 5000); // Agrega margen adicional
                }

                // Crea un estilo de celda para las celdas de la tabla
                CellStyle estiloTabla = libro.createCellStyle();
                estiloTabla.setBorderBottom((short) 1);  // Usamos valores numéricos en lugar de BorderStyle.THIN
                estiloTabla.setBorderTop((short) 1);     // Usamos valores numéricos en lugar de BorderStyle.THIN
                estiloTabla.setBorderLeft((short) 1);    // Usamos valores numéricos en lugar de BorderStyle.THIN
                estiloTabla.setBorderRight((short) 1);   // Usamos valores numéricos en lugar de BorderStyle.THIN

                // Agrega los datos de las celdas
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio++);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);

                        // Obtener el valor de la celda
                        Object valorCelda = t.getValueAt(f, c);

                        // Comprobar si el valor de la celda es nulo antes de convertirlo a String
                        if (valorCelda != null) {
                            // Si el valor no es nulo, verificamos su tipo y lo asignamos
                            if (valorCelda instanceof Double) {
                                celda.setCellValue((Double) valorCelda);
                            } else {
                                celda.setCellValue(valorCelda.toString());  // Usamos el valor convertido a String
                            }
                        } else {
                            celda.setCellValue("");  // Asignamos un valor vacío si la celda está vacía
                        }

                        // Aplica el estilo a la celda
                        celda.setCellStyle(estiloTabla);
                    }
                }

                // Escribe el archivo y luego lo abre
                libro.write(archivo);
                Desktop.getDesktop().open(archivoXLS);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Cierra los recursos manualmente
                if (archivo != null) {
                    try {
                        archivo.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (libro != null) {
                    try {
                        archivo.close();
                    } catch (IOException e) {
                        e.printStackTrace();  // Imprime el detalle completo del error
                    }
                }
            }
        }
    }
}

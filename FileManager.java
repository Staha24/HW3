package HW3;

import java.io.*;

public class FileManager {
    //метод для чтения файла
    public String read(String filePath) throws FileNotFoundException, IOException{

        FileReader fileReader = new FileReader(filePath);//создали объект для чтения
        BufferedReader bufferedReader = new BufferedReader(fileReader);//создали буфер для чтения из данных
        String content = "";//строка для хранения считанного файла

        try {
            //считываем содержимое файла
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "n";
            }
        }finally {
            //закрываем файлы
            bufferedReader.close();
            fileReader.close();
        }
        return content;
    }


    //метод для записи данных в файл
    public void write(String filePath, String content) throws IOException{
        FileWriter fileWriter = new FileWriter(filePath);//ощздали объект для записи в файл
        try {
            fileWriter.write(content);//записываем содержимое в файл
        }finally {
            fileWriter.close();//закрываем файл
        }
    }


    //Метод для копирования файла
    public void copy(String sourcePath, String destinationPath) throws IOException{
        //File sourcePath = null;
        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            throw new FileNotFoundException("File not found" + sourcePath);
        }
        File destinationFile = new File(destinationPath);

        try (InputStream input = new FileInputStream(sourceFile);
            OutputStream output = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

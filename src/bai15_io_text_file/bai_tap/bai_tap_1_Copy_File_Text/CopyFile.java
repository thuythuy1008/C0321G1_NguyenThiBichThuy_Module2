package bai15_io_text_file.bai_tap.bai_tap_1_Copy_File_Text;

import java.io.*;

public class CopyFile {
    public static void copyFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            FileWriter fileWriter = new FileWriter("src\\bai15_io_text_file\\bai_tap\\bai_tap_1_Copy_File_Text\\target.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại!!!");
        } catch (IOException e) {
            System.err.println("Nội dung có lỗi!!!");
        }
    }

    public static void main(String[] args) {
        String filePath = "src\\bai15_io_text_file\\bai_tap\\bai_tap_1_Copy_File_Text\\source.txt";
        copyFile(filePath);
    }
}
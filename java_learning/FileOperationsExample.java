// 示例：文件操作
import java.io.*;

public class FileOperationsExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "这是一个文件操作示例。";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("文件写入成功: " + fileName);
        } catch (IOException e) {
            System.out.println("写入文件时发生错误: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("读取内容: " + line);
            }
        } catch (IOException e) {
            System.out.println("读取文件时发生错误: " + e.getMessage());
        }
    }
}
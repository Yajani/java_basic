package day11.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일 불러오기 !!!
public class FileInputExample {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\java_basic\\src\\day01\\Scope.java";
        try(FileInputStream fis = new FileInputStream(path)) {

            int data = 0;

            while(data != -1){
                data = fis.read();
                System.out.println(data); //아스키를 문자로 출력
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
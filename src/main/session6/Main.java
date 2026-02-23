package main.session6;

public class Main {
    public static void main(String[] args){
        try { // xử lý ngoại lệ
            System.out.println("Start....");
            int x = 10;
            int y = 2;
            if(y < 5){
                // chủ động phát ra ngoại lệ
                throw new Exception("Số bé quá ko được");
            }else if(y<8){
                throw new ArithmeticException("Số chưa hợp lệ");
            }
            //
            int z;
            z = x / y;
            System.out.println("z=" + z);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
           // lúc nào cũng chạy qua
        }
        try {
            readExcelFile();
        }catch (Exception e){

        }

    }

    // báo hiệu có ngoại lệ ở hàm
    public static void readExcelFile() throws Exception{
        // giả sử hàm này sẽ có thể có exception
    }
}

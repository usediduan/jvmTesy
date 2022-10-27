import org.junit.Test;

public class Demo {
    @Test
    public void test1(){
          int i = 5;
          int b = 6;
          if (i  > 10){

          }else if (i>5){

          }else {
          throw new RuntimeException();
          }
        System.out.println(i>b);
    }
    @Test
    public void test2(){
       float i = 5 ;
       float b = 7;
    }
    @Test
    public void test3(){
        int i = 0;
        i++;
        System.out.println(i);
    }
    @Test
    public void test4(){
        int i = 0;
        ++i;
        System.out.println(i);
    }
    @Test
    public void test5(){
        int i = 0;
        print(i++);
        System.out.println(i);
    }
    @Test
    public void test6(){
        int i = 0;
        print(++i);
        System.out.println(i);
    }
    public void print(int i){
        System.out.println(i);
    }
}

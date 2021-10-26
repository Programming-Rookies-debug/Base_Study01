package Exception_异常类;

/**
 * @author Sunpl
 * @description 测试类
 * @date 2021/10/26
 */
public class Test {
    public static void main(String[] args) throws CatchException {

        try {
             if (10>9){
                 CatchException catchException = new CatchException("0012", "这是一个报错的信息!!!");
                 throw catchException;
             }
        } catch (CatchException catchException) {
            throw catchException;
        } catch (Exception e) {
                throw e;
        }

    }

}

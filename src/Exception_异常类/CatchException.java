package Exception_异常类;

/**
 * @author Sunpl
 * @description 异常类
 * @date 2021/10/26
 */
public class CatchException extends Exception {
    private   static final long serialVersionUID = -3387516995124229948L;
    private String errCode;
    private String errMsg;
    public CatchException(String errCode,String errMsg){
        super(errCode+""+errMsg);
        this.errCode=errCode;
        this.errMsg=errMsg;
    }
    public CatchException(String errCode,String errMsg,Throwable throwable){
        super(errCode+""+errMsg,throwable);
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}

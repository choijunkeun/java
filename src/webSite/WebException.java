package webSite;

public class WebException extends Exception{
    Error code;


    public WebException(String message) {
        super(message);
    }

    public WebException(String message, Error code) {
        super(message);
        this.code = code;
    }

    @Override
    public String toString() {
        String errMessage="";
        switch(code) {
            case SEARCHERR  : errMessage += "도메인 주소가 틀렸습니다.";             break;
            case FRONTERR   : errMessage += "앞으로 갈 페이지가 존재하지 않습니다.";    break;
            case BACKERR    : errMessage += "뒤로 갈 페이지가 존재하지 않습니다.";      break;
            case NUM_ERR    : errMessage += "잘못 된 메뉴를 선택하셨습니다.";          break;
        }
        return errMessage;
    }
}

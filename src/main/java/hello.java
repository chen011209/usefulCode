import util.HttpRequest;

import java.io.IOException;

public class hello {
    public static void main(String[] args) {
        HttpRequest h=new HttpRequest("https://api.cntv.cn/olympic/getBjOlyMedals?serviceId=2022dongao&itemcode=GEN-------------------------------&t=jsonp&cb=omedals1");
        try {
            System.out.println(h.httpGetString());
        }
        catch (IOException e){

        }
    }
}


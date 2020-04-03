package workshop.sc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Response {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @JsonIgnore
    private long id;

    private String service;
    private String msg;

    public Response(){

    }
    public Response(String service, String msg){
        this.service = service;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

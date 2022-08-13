package coconutmt.studysms.service;

public interface SmsService {
    void send(String phoneNumber, String signName, String templateCode);
}

package springboot.itgod.study.springframework.services;

public class FirstService {
    SecondService secondService;

    public SecondService getSecondService() {
        return secondService;
    }

    public void setSecondService111(SecondService secondService) {
        this.secondService = secondService;
    }
}

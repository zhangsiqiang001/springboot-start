package springboot.itgod.study.springframework.services;

public class ThirdService {
    SecondService secondService;

    public void getSecondService() {
        System.out.println(secondService);
    }
}

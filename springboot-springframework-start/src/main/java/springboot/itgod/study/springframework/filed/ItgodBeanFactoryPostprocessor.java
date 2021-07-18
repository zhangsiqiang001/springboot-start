package springboot.itgod.study.springframework.filed;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class ItgodBeanFactoryPostprocessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition thirdService = (GenericBeanDefinition) beanFactory.getBeanDefinition("ThirdService");
        thirdService.setAutowireMode(2);
        System.out.println(thirdService.getAutowireMode());
    }
}

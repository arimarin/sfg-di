package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Ari on 26.09.2020
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("## At LifeCycleBean Constructor! ##");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("## LifeCycleBean PostConstruct! ##");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## BeanFactory has been set! ##");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## Bean name is " + name + "! ##");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## Seconds before termination (AKA PreDestroy)! ##");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## LifeCycleBean has been terminated! ##");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## LifeCycleBean has its properties set! ##");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## ApplicationContext has been set! ##");
	}

	public void beforeInit() {
		System.out.println("## -- Before Init -- Called by BeanPostProcessor! ##");
	}

	public void afterInit() {
		System.out.println("## -- After Init -- Called by BeanPostProcessor! ##");
	}
}

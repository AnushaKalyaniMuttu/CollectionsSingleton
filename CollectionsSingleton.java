package com.bean;

import java.util.Collections;
import java.util.Set;

public class CollectionsSingleton {
	/*
	 * Set<T> s=Collections.singleton(T t);
  *   is immutable you can't add or remove elements from it.
  * If we try to add it , we ll get UnsupportedOperationException
	 */

	public static void main(String[] args) {
		 String element = "Hello";
	        Set<String> singletonSet = Collections.singleton(element);
	        
	        singletonSet.add(element);//UnsupportedOperationException
	        System.out.println("Singleton set: " + singletonSet);
	      	}
		
	}

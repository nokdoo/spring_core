package com.blogvillain.spring_core._06annotationbased.configuration;

/**
 * @author nokdoot
 */

public class Required {
    private AnyClass anyClass;

    @org.springframework.beans.factory.annotation.Required
}

class AnyClass {

}

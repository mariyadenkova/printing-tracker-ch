/*package eu.printingtrackerv2.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;

public class UniqueValidator implements ConstraintValidator<Unique, Object> {

    @Autowired
    private ApplicationContext applicationContext;

    //private FieldValueExist service;
    private String fieldName;

    @Override
    public void initialize(Unique unique) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return !this.service.fieldValueExist(o, this.fieldName);
    }
}*/

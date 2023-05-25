package tranvanthang.lab3.Validator;

import jakarta.validation.ConstraintValidatorContext;
import tranvanthang.lab3.Validator.annotation.ValidCategoryId;
import tranvanthang.lab3.entity.Category;
import jakarta.validation.ConstraintValidator;


public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {

    @Override
    public  boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
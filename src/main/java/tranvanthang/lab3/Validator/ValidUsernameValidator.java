package tranvanthang.lab3.Validator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import tranvanthang.lab3.Validator.annotation.ValidUsername;
import tranvanthang.lab3.repository.IUserRepository;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
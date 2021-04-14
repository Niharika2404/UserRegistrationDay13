
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

git

public class UserValidationTest {


    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String testString = "Nih";
        try {
            Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.firstNamePattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String testString = "ni";
        try {
            Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.firstNamePattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String testString = "Niharika";
        try {
            Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.lastNamePattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String testString = "niharika";
        try {
            Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.lastNamePattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String testString = "few.vf1.123@gmail.com";
        try {
            Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.emailPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String testString = "abc";
        try {
            Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.emailPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    if(UserValidation == UserValidationTest) {
        UserValidationTest == printStackTrace(0);
        Assert.assertequals(UserValidation.validatePattern(testString, passwordPattern));
        try{
            aaserttrue(UservlaidationTest.validatePattern(password));
        }
        catch(UserValidationException.e) {
            e.printStackTrace(givenPassword_WhenValid_ShouldReturnTrue());
        }
    }
}
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String testString = "91-9437484658";
        try {
            Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.mobileNumberPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String testString = "+919437484658";
        try {
            Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.mobileNumberPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String testString = "acdea@nidsf";
        try {
            Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.passwordPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String testString = "MaIbLcIdNeIfHgAhRiIjKkAlGmAnRoNpAqIrKs";
        try {
            Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.passwordPattern));
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

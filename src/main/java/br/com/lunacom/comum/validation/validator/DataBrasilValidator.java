package br.com.lunacom.comum.validation.validator;

import br.com.lunacom.comum.util.DataUtil;
import br.com.lunacom.comum.validation.DataBrasil;
import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.format.DateTimeParseException;

public class DataBrasilValidator implements ConstraintValidator<DataBrasil, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isNotBlank(value)) {
            try {
                DataUtil util = new DataUtil();
                util.dataBrParaLocalDate(value);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}

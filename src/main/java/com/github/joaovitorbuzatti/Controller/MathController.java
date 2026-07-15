package com.github.joaovitorbuzatti.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joaovitorbuzatti.exception.UnsupportedMathOperationException;
import com.github.joaovitorbuzatti.math.SimpleMath;
import com.github.joaovitorbuzatti.request.converters.NumberConverters;

@RestController
@RequestMapping("/math")
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
        @PathVariable("numberOne")String numberOne,
        @PathVariable("numberTwo")String numberTwo
    )throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.sum(NumberConverters.covertToDouble(numberOne), NumberConverters.covertToDouble(numberTwo));
    }
    
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
        @PathVariable("numberOne")String numberOne,
        @PathVariable("numberTwo")String numberTwo
    )throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.sub(NumberConverters.covertToDouble(numberOne), NumberConverters.covertToDouble(numberTwo));
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
        @PathVariable("numberOne") String numberOne,
        @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.mult(NumberConverters.covertToDouble(numberOne), NumberConverters.covertToDouble(numberTwo));
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
        @PathVariable("numberOne") String numberOne,
        @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.div(NumberConverters.covertToDouble(numberOne), NumberConverters.covertToDouble(numberTwo));
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
        @PathVariable("numberOne") String numberOne,
        @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.mean(NumberConverters.covertToDouble(numberOne), NumberConverters.covertToDouble(numberTwo));
    }

    @RequestMapping("/sqrt/{number}")
    public Double sqrt(
        @PathVariable("number") String number
    ) throws Exception {
        if (!NumberConverters.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.sqrt(NumberConverters.covertToDouble(number));
    }

}

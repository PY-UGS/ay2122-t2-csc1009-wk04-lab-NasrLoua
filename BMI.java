package lab4Q1;

public class BMI {
    private double weight;
    private double height;

    public BMI() {

        this.weight = 0;
        this.height = 0;
    }

    public BMI(double weight, double height) {

        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmiValue() {
        double kgConversion = this.weight * 0.45359237;
        double meterConversion = this.height * 0.0254;

        double bmiCalc = kgConversion / Math.pow(meterConversion,2);

        return bmiCalc;
    }

    public String getBmiIntprt() {
        String bmiInterpretation;

        if (this.getBmiValue() < 18.5)
            bmiInterpretation = "Underweight";

        else if (this.getBmiValue() > 18.5 && this.getBmiValue() < 25.0)
            bmiInterpretation = "Normal";

        else if (this.getBmiValue() > 25.0 && this.getBmiValue() < 30.0)
            bmiInterpretation = "Overweight";
        
        else
            bmiInterpretation = "Obese";

        return bmiInterpretation;
    }

}

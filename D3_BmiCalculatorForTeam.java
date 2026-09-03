// 3. BMI Calculator for a Team
public class D3_BmiCalculatorForTeam {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            double roundedBmi = Math.round(bmi * 100.0) / 100.0;

            System.out.println("Person " + (i + 1) + " — Height: " + heights[i]
                    + " m, Weight: " + (int) weights[i] + " kg BMI: "
                    + roundedBmi + " | Status: " + status);
        }
    }

    public static void main(String[] args) {
        // Demo data for a team of 10 employees
        double[] heights = {1.75, 1.60, 1.68, 1.82, 1.55, 1.70, 1.65, 1.90, 1.58, 1.77};
        double[] weights = {70, 90, 55, 85, 60, 75, 50, 95, 65, 80};

        printWellnessReport(heights, weights);
    }
}

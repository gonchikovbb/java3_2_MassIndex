public class BmiService {
    public float calculate(float bodyMass, float growth) {
        float bmi = bodyMass / (growth * growth / 10000);
        return bmi;
    }
}

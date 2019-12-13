class Check {
    boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

public class LinearEquation {
    // instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;


// constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
}


// methods
    public double distance() {
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return roundedToHundredth(distance);
    }




    public double yIntercept() {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        double yint = y1 - ((slope)*x1);
        return roundedToHundredth(yint);
    }




    public double slope() {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        return roundedToHundredth(slope);
    }



// equation method with all tedious specifications
    public String equation() {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen / sloped;
        double yint = y1 - ((slope) * x1);
        if (((int) (slope)) == slope) {
            if (slope == 1) {
                if (yint < 0) {
                    return"y = x - " + Math.abs(roundedToHundredth(yint));
                } else if (yint == 0) {
                    return"y = x";
                } else {
                    return"y = x + " + roundedToHundredth(yint);
                }
            } else if (slope == -1) {
                if (yint < 0) {
                    return"y = -x - " + Math.abs(roundedToHundredth(yint));
                } else if (yint == 0) {
                    return"y = -x";
                } else {
                    return"y = -x + " + roundedToHundredth(yint);
                }
            } else {
                if (yint < 0) {
                    if (slope == 0) {
                        return"y = -" + (int) (Math.abs(roundedToHundredth(yint)));
                    } else if (slope < 0) {
                        return"y = -" + (int) (Math.abs(roundedToHundredth(slope))) + "x - " + Math.abs(roundedToHundredth(yint));
                    } else {
                        return"y = " + (int) (roundedToHundredth(slope)) + "x - " + Math.abs(roundedToHundredth(yint));
                    }
                } else if (yint == 0) {
                    if (slope == 0) {
                        return"y = 0";
                    } else if (slope < 0) {
                        return"y = -" + (int) (Math.abs(roundedToHundredth(slope))) + "x";
                    } else {
                        return"y = " + (int) (Math.abs(roundedToHundredth(slope))) + "x";
                    }
                } else {
                    if (slope == 0) {
                        return"y = " + roundedToHundredth(yint);
                    } else if (slope < 0) {
                        return"y = -" + Math.abs(roundedToHundredth(slope)) + "x + " + roundedToHundredth(yint);
                    } else {
                        return"y = " + roundedToHundredth(slope) + "x + " + roundedToHundredth(yint);
                    }
                }
            }
        } else {
            if (yint < 0) {
                if (slope == 0) {
                    return"y = -" + Math.abs(roundedToHundredth(yint));
                } else if (slope < 0) {
                    return"y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x - " + Math.abs(roundedToHundredth(yint));
                } else {
                    return"y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x - " + Math.abs(roundedToHundredth(yint));
                }
            } else if (yint == 0) {
                if (slope == 0) {
                    return"y = 0";
                } else if (slope < 0) {
                    return"y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x";
                } else {
                    return"y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x";
                }
            } else {
                if (slope == 0) {
                    return"y = " + roundedToHundredth(yint);
                } else if (slope < 0) {
                    return"y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x + " + roundedToHundredth(yint);
                } else {
                    return"y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x + " + roundedToHundredth(yint);
                }
            }
        }
    }





// user x value, finding the coords
    public String coordinateForX(double xValue) {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        double yint = y1 - ((slope)*x1);
        double yVal = ((xValue*slope) + yint);
        return"\nThe point on the line is: (" + roundedToHundredth(xValue) + ", " + roundedToHundredth(yVal) + ")";
    }





// rounding method used for many other methods
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.0;
    }



// info statement printing
    public String lineInfo() {
        return"\nThe two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\nThe equation of the line between these points is: " + equation() + "\nThe slope" +
                " of the line is: " + slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the two points is: " + distance();
    }

}

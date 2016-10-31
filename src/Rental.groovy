/**
 * Created by Gabriela on 14/10/16.
 */
class Rental {

    private Movie _movie;
    private int _daysRented;

    Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    def getDaysRented(){
        _daysRented
    }

    def getMovie(){
        _movie
    }

    def double getCharge() {
        double amount = 0
        //determine amounts for aRental line
        switch (this.getMovie().getType()) {
            case Movie.REGULAR:
                amount += 2
                if (this.getDaysRented() > 2)
                    amount += (this.getDaysRented() - 2) * 1.5
                break
            case Movie.NEW_RELEASE:
                amount += this.getDaysRented() * 3
                break
            case Movie.CHILDRENS:
                amount += 1.5;
                if (this.getDaysRented() > 3)
                    amount += (this.getDaysRented() - 3) * 1.5
                break
        }
        amount
    }

    def getPoints() {
        // add bonus for a two day new release rental
        def extraPoint = (this.getMovie().getType() == Movie.NEW_RELEASE) && this.getDaysRented() > 1
        extraPoint ? 2 : 1
    }
}

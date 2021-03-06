/**
 * Created by Gabriela on 14/10/16.
 */
class Movie {

    private String _title
    Price _price


    Movie(String title, int priceCode) {
        _title = title
        _price = setType(priceCode)
    }

    def getTitle(){
        _title
    }

    def getType(){
        _price.getPriceCode()
    }

    def setType(int code){
        Price.newType(code)
    }

    double getCharge(int daysRented){
        _price.getCharge(daysRented)
    }

    int getPoints(int daysRented) {
        return _price.getPoints(daysRented);
    }

}

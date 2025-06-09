package hello.library.rental;

public interface RentalService {
    Rental rentBook(Long memberId, String bookTitle);
}

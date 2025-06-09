package hello.library.rental;

import java.time.LocalDate;

public class Rental {
    private Long memberId;
    private String bookTitle;
    private LocalDate rentDate;
    private LocalDate dueDate;

    public Rental(Long memberId, String bookTitle, LocalDate rentDate, LocalDate dueDate) {
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.rentDate = rentDate;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "memberId=" + memberId +
                ", bookTitle='" + bookTitle + '\'' +
                ", rentDate=" + rentDate +
                ", dueDate=" + dueDate +
                '}';
    }
}

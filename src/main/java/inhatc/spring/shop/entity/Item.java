package inhatc.spring.shop.entity;

import inhatc.spring.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long id;

    @Column(nullable = false, length = 50)
    private String ItemNm;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, name="number")
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    private String ItemDetail;

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;


    private LocalDateTime regTime;      // 등록일 (추후 제거)
    private LocalDateTime updateTime;   // 수정일 (추후 제거)
}

package board_test.board.entity;

import board_test.board.boardDTO.BoardDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 20, nullable = false)
    private String boardWriter;

    @Column(nullable = false, unique = true)
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500, nullable = false)
    private String boardContents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }

//    @Builder
//    public BoardEntity(Long id, String boardTitle, String boardWriter, String boardPass,
//                       String boardContents, int boardHits) {
//
//        this.id = id;
//        this.boardTitle = boardTitle;
//        this.boardWriter = boardWriter;
//        this.boardPass = boardPass;
//        this.boardContents = boardContents;
//        this.boardHits = boardHits;
//    }
}

package board_test.board.BoardService;


import board_test.board.boardDTO.BoardDTO;
import board_test.board.entity.BoardEntity;
import board_test.board.entity.BoardEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardEntityRepository boardEntityRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity saveEntity = BoardEntity.toSaveEntity(boardDTO);
        boardEntityRepository.save(saveEntity); // save 메서드의 인수는 entity 를 필요로 함. dto -> entity or entity -> dto 가 빈번
    }

}

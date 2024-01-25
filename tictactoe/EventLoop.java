
public class EventLoop
{
    initialize program state data

    if gameState == STANDBY
      set gameState = GET_X_NAME

    else if gameState == GET_X_NAME
      get player X name
      set gameState = GET_O_NAME

    else if gameState == GET_O_NAME
      get player O name
      set gameState = GET_X_MOVE

    else if gameState == GET_X_MOVE
      do
        get player X's row and column to move
      while player's inputs and player's move are NOT valid
      set gameState = MAKE_MOVE

    else if gameState == GET_O_MOVE
      do
        get player O's row and column to move
      while player's inputs and player's move are NOT valid
      set gameState = MAKE_MOVE

    else if gameState == MAKE_MOVE
      print player's move
      add player's move to the board
      set gameState = CHECK_IF_WINNER

    else if gameState == CHECK_IF_WINNER
      if x is a winner
        set gameState = X_WINS
     else if o is a winner
        set gameState = O_WINS
      else 
        set gameState = CHECK_IF_TIE

    else if gameState == CHECK_IF_TIE
      if game is tied
    
}

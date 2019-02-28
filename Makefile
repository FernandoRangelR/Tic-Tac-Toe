default: Oxo
oxo = Oxo, Display, Board, Values, GameState
display = Display, Values
board = Board, Grid, State, Values
state = State, Values
grid = Grid, Values
gamestate = GameState
values = Values

%: %.java
	javac $@.java
	java -ea $@

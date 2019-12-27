import de.acagamics.game.controller.IPlayerController;
        import de.acagamics.game.logic.Map;
        import de.acagamics.game.logic.Player;

public final class CrushBot implements IPlayerController {
    public CrushBot() {
    }

    public String getAuthor() {
        return "Arvid Neumann";
    }

    public int getMatrikelnummer() {
        return -1;
    }

    public void think(Map mapInfo, Player ownPlayer, Player enemyPlayerInfo) {
    }
}
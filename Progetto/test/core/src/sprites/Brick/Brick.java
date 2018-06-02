package sprites.Brick;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import help.Info;
import sprites.powerup.PowerUp;

import java.io.Serializable;

/**
 * @author Daniele Ligato
 * La classe astratta Brick extende la classe di libGDX
 * chiama Sprite e contiene tutte le informazioni e variabili del "mattoncino base",
 * quali per esempio la sua posizione.
 *
 */
public interface Brick {


    void setPowerUp(PowerUp powerUp);

    boolean hasPowerUp();

    PowerUp getPowerUp();

    Vector2 getPositionBrick();

    boolean isDeletable();

    String getRelativePosition(Brick brick);

    void delete();

    void setPositionBrick(Vector2 positionBrick);

    void setBoundsBrick(Rectangle boundsBrick);

    void setEliminato(boolean eliminato);

    Rectangle getBoundsBrick();

    boolean isEliminato();
}

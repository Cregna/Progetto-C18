package com.mygdx.game.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.BreakGame;

/**
 * @Autor regna, ligato,schillaci
 * Questa classe implementa la schermata che apparirà quando si perde
 *
 */
public class LoseGameScreen implements Screen {

    private Texture gameOver;
    private BreakGame game;
    private int newHeight, newWight;
    private float coeffDimensionale, barreNere;
    private float tempVet[];
    private Resizer resizer;

    public LoseGameScreen(BreakGame game) {
        this.game = game;
        resizer = new Resizer();
        tempVet = new float[2];
    }

    /**
     * Indica il background da mostrare quando si perde
     */

    @Override
    public void show() {
        gameOver = new Texture("gameover.jpg");
    }

    /**
     * Gestisce il proseguimento del programma, dopo che compare la schermata di "Loose"
     * @param delta
     */
    @Override
    public void render(float delta) {
        game.getBatch().begin();
        game.getBatch().draw(gameOver, 0, 0);
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            game.setScreen(new MainMenuScreen(game));
        }

        game.getBatch().end();
    }

    @Override
    public void resize(int width, int height) {
        this.newHeight = height;
        this.newWight = width;

        tempVet = resizer.toResize(height, width);
        barreNere = tempVet[0];
        coeffDimensionale = tempVet[1];

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

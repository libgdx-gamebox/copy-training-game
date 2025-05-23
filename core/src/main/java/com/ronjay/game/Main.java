package com.ronjay.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.GL20;

import static com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch spriteBatch;
    private Texture image;

    public Sprite textureSprite;

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        image = new Texture("libgdx.png");

        sandTexture = new Texture(Gdx.files.internal("Tileable_Dirt_Textures/Dirt_01_Nrm.png"));
        textureSprite = new Sprite(sandTexture);
        textureSprite.setBounds(0, 0, 200,200);

    }

    @Override
    public void render() {

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        spriteBatch.begin();
//        spriteBatch.draw(image, 140, 210);
        textureSprite.draw(spriteBatch);

        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        spriteBatch.dispose();
        image.dispose();
    }

    @Override
    public void resize(int width, int height) {
        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height); // update projection matrix
    }
}

package com.mygdx.game;

// imports
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.Game;

public class StarfishCollectorAlpha extends Game {
	private SpriteBatch batch;
	private Texture turtleTexture;
	private float turtleX;
	private float turtleY;
	private Rectangle turtleRectangle;

	private Texture starfishTexture;
	private float starfishX;
	private float starfishY;
	private Rectangle starfishRectangle;

	private Texture oceanTexture;
	private Texture winMessageTexture;

	private boolean win;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		// turtle init
		turtleTexture = new Texture(Gdx.files.internal("assets/turtle-1.png"))
		turtleX = 20;
		turtleY = 20;
		turtleRectangle = new Rectangle(turtleX,turtleY,turtleTexture.getWidth(),turtleTexture.getHeight());
		
		// starfish init
		starfishTexture = new Texture(Gdx.files.internal("assets.getHeight()"));
		starfishX = 380;
		starfishY = 380;
		starfishRectangle = new Rectangle(starfishX, starfishY, starfishTexture.getWidth(), starfishTexture.getHeight());

		// background init
		oceanTexture = new Texture(Gdx.files.internal("assets/water.jpg"));
		winMessageTexture = new Texture(Gdx.files.internal("assets/you-win.jpg"));

		win = false;
	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {

	}
}

package cn.yapeteam.yolbi.font.awt;

import lombok.AllArgsConstructor;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * @author ChengFeng
 * @since 2024/7/29
 **/
@AllArgsConstructor
public class FontCharacter {
    private int texture;
    private float width, height;

    public void render(float x, float y) {
        GlStateManager.bindTexture(this.texture);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0.0F, 0.0F);
        GL11.glVertex2f(x, y);
        GL11.glTexCoord2f(0.0F, 1.0F);
        GL11.glVertex2f(x, y + this.height);
        GL11.glTexCoord2f(1.0F, 1.0F);
        GL11.glVertex2f(x + this.width, y + this.height);
        GL11.glTexCoord2f(1.0F, 0.0F);
        GL11.glVertex2f(x + this.width, y);
        GL11.glEnd();
    }

    public int texture() {
        return texture;
    }

    public float width() {
        return width;
    }

    public float height() {
        return height;
    }
}

package io.github.santulator.gui.i18n;

import org.junit.jupiter.api.Test;

import static io.github.santulator.gui.i18n.I18nKey.ABOUT_TITLE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class I18nManagerTest {
    private final I18nManager target = new I18nManagerImpl();

    @Test
    public void testGuiBundle() {
        String value = target.bundle().getString(ABOUT_TITLE.getKey());

        validateGuiValue(value);
    }

    @Test
    public void testGuiText() {
        String value = target.text(ABOUT_TITLE);

        validateGuiValue(value);
    }

    private void validateGuiValue(final String value) {
        assertEquals("Santulator", value);
    }
}
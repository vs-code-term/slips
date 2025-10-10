#!/bin/bash
# Installer for eduslip-ok (non-root version)

INSTALL_PATH="$HOME/.local/bin"

mkdir -p "$INSTALL_PATH"
curl -L -o "$INSTALL_PATH/eduslip-ok" https://raw.githubusercontent.com/vs-code-term/slips/main/eduslip-ok.sh
chmod +x "$INSTALL_PATH/eduslip-ok"

# Add to PATH if not already there
if [[ ":$PATH:" != *":$INSTALL_PATH:"* ]]; then
    echo "export PATH=\$PATH:$INSTALL_PATH" >> ~/.bashrc
    echo "✅ Added $INSTALL_PATH to PATH. Please restart terminal or run: source ~/.bashrc"
fi

echo "✅ eduslip-ok installed successfully!"
echo "Now you can run: eduslip-ok <subject> <slip-no>"

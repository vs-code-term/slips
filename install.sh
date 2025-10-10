#!/bin/bash
# Installer for eduslip-ok

# Step 1: Download the main script from your GitHub
sudo curl -L -o /usr/local/bin/eduslip-ok https://raw.githubusercontent.com/gc-dev-term/slips/main/eduslip-ok.sh

# Step 2: Make it executable
sudo chmod +x /usr/local/bin/eduslip-ok

# Step 3: Success message
echo "✅ eduslip-ok installed successfully!"
echo "You can now use it like: eduslip-ok <subject> <slip-no>"

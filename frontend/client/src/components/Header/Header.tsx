import React from 'react';
import { AppBar, Box, Toolbar, Typography, IconButton } from '@mui/material';
import { BackupTable } from '@mui/icons-material';

const Header: React.FC = () => {
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar>
          <IconButton size="large" edge="start" color="inherit" aria-label="home" sx={{ mr: 2 }}>
            <BackupTable />
          </IconButton>
          <Typography variant="h5" component="div" sx={{ flexGrow: 1 }}>
            Media App
          </Typography>
        </Toolbar>
      </AppBar>
    </Box>
  );
};

export default Header;

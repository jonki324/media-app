import React from 'react';
import { BottomNavigation, BottomNavigationAction } from '@mui/material';
import { GitHub } from '@mui/icons-material';

const Footer: React.FC = () => {
  return (
    <BottomNavigation showLabels>
      <BottomNavigationAction
        label="© jonki324@gmail.com"
        icon={<GitHub />}
        onClick={() => window.open('https://github.com/jonki324')}
      />
    </BottomNavigation>
  );
};

export default Footer;

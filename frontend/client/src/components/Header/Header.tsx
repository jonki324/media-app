import React from 'react';
import { Link as RouterLink } from 'react-router-dom';
import {
  AppBar,
  Box,
  Toolbar,
  Typography,
  IconButton,
  Button,
  Menu,
  MenuItem,
  Divider,
  ListItemIcon,
  Tooltip,
  Avatar,
  Link,
} from '@mui/material';
import {
  BackupTable,
  Settings,
  Logout,
  Info,
  PostAdd,
  Bookmarks,
  Person,
} from '@mui/icons-material';

const Header: React.FC = () => {
  const [anchorEl, setAnchorEl] = React.useState<null | HTMLElement>(null);
  const open = Boolean(anchorEl);
  const handleClick = (event: React.MouseEvent<HTMLButtonElement>) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar>
          <IconButton size="large" edge="start" color="inherit" aria-label="home" sx={{ mr: 1 }}>
            <Link component={RouterLink} to="/" color="inherit" underline="none">
              <BackupTable />
            </Link>
          </IconButton>
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            <Link component={RouterLink} to="/" color="inherit" underline="none">
              Media App
            </Link>
          </Typography>
          <Box>
            <Button component={RouterLink} to="/about" startIcon={<Info />} color="inherit">
              About
            </Button>
            <Tooltip title="Account Menu">
              <IconButton onClick={handleClick}>
                <Avatar>
                  <Person />
                </Avatar>
              </IconButton>
            </Tooltip>
            <Menu
              id="basic-menu"
              anchorEl={anchorEl}
              open={open}
              onClose={handleClose}
              MenuListProps={{
                'aria-labelledby': 'basic-button',
              }}
            >
              <MenuItem onClick={handleClose}>
                <ListItemIcon>
                  <Bookmarks />
                </ListItemIcon>
                <Link component={RouterLink} to="/mypage" color="inherit" underline="none">
                  MyPage
                </Link>
              </MenuItem>
              <MenuItem onClick={handleClose}>
                <ListItemIcon>
                  <PostAdd />
                </ListItemIcon>
                <Link component={RouterLink} to="/editor" color="inherit" underline="none">
                  Post New Article
                </Link>
              </MenuItem>
              <Divider />
              <MenuItem onClick={handleClose}>
                <ListItemIcon>
                  <Settings />
                </ListItemIcon>
                <Link component={RouterLink} to="/setting" color="inherit" underline="none">
                  Settings
                </Link>
              </MenuItem>
              <MenuItem onClick={handleClose}>
                <ListItemIcon>
                  <Logout />
                </ListItemIcon>
                <Link component={RouterLink} to="/logout" color="inherit" underline="none">
                  Logout
                </Link>
              </MenuItem>
            </Menu>
          </Box>
        </Toolbar>
      </AppBar>
    </Box>
  );
};

export default Header;

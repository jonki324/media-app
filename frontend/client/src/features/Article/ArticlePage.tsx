import React from 'react';
import {
  Grid,
  Avatar,
  List,
  ListItem,
  ListItemAvatar,
  ListItemText,
  Divider,
  IconButton,
  Typography,
  Stack,
  Chip,
  TextField,
  Box,
} from '@mui/material';
import { BookmarkAdd, PersonAdd, Person, Label, Image, AddComment } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const ArticlePage: React.FC = () => {
  const contents =
    'Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body, Contents Body.';
  return (
    <Layout>
      <Grid container justifyContent="center" pt={4} spacing={1}>
        <Grid item maxWidth="md">
          <Typography variant="h4">Sample Title</Typography>
          <List sx={{ width: '100%' }}>
            <ListItem
              secondaryAction={
                <IconButton edge="end">
                  <BookmarkAdd />
                  <PersonAdd />
                </IconButton>
              }
            >
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText primary="Author ID" secondary="Description" />
            </ListItem>
          </List>
          <Stack direction="row" spacing={1} mt={2}>
            <Chip icon={<Label />} size="small" label="Sample Tag1" />
            <Chip icon={<Label />} size="small" label="Sample Tag2" />
          </Stack>
          <Image sx={{ width: '30%', height: '30%' }} />
          <Typography variant="body1">{contents}</Typography>
          <List>
            <ListItem>
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText primary="Comment User ID" secondary="Comment" />
            </ListItem>
            <Divider variant="inset" component="li" />
            <ListItem>
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText primary="Comment User ID" secondary="Comment" />
            </ListItem>
            <Divider variant="inset" component="li" />
            <ListItem>
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText>
                <Box sx={{ display: 'flex' }}>
                  <TextField id="comment" label="Comment" variant="outlined" fullWidth />
                  <IconButton>
                    <AddComment />
                  </IconButton>
                </Box>
              </ListItemText>
            </ListItem>
          </List>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default ArticlePage;

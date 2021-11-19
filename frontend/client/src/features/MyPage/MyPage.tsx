import React from 'react';
import {
  Grid,
  Card,
  CardContent,
  CardHeader,
  Typography,
  Avatar,
  Chip,
  Stack,
  List,
  ListItem,
  ListItemAvatar,
  ListItemText,
  ListSubheader,
  IconButton,
  ListItemIcon,
  Divider,
} from '@mui/material';
import { Image, Label, BookmarkRemove, Person, PersonRemove } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const MyPage: React.FC = () => {
  return (
    <Layout>
      <Grid container justifyContent="center" pt={4} spacing={1}>
        <Grid item xs={12} md={9}>
          <Stack spacing={1}>
            <Card>
              <Grid container>
                <Grid item xs={9}>
                  <CardHeader
                    avatar={
                      <Avatar>
                        <Image />
                      </Avatar>
                    }
                    title="Author Name"
                    subheader="2021-11-22"
                  />
                  <CardContent>
                    <Typography variant="h5">Sample Title</Typography>
                    <Typography variant="body2">Sample Description Body</Typography>
                    <Stack direction="row" spacing={1} mt={2}>
                      <Chip icon={<Label />} size="small" label="Sample Tag1" />
                      <Chip icon={<Label />} size="small" label="Sample Tag2" />
                    </Stack>
                  </CardContent>
                </Grid>
                <Grid item xs={3}>
                  <Image sx={{ width: '100%', height: '100%' }} />
                </Grid>
              </Grid>
            </Card>
            <Card>
              <Grid container>
                <Grid item xs={9}>
                  <CardHeader
                    avatar={
                      <Avatar>
                        <Image />
                      </Avatar>
                    }
                    title="Author Name"
                    subheader="2021-11-22"
                  />
                  <CardContent>
                    <Typography variant="h5">Sample Title</Typography>
                    <Typography variant="body2">Sample Description Body</Typography>
                    <Stack direction="row" spacing={1} mt={2}>
                      <Chip icon={<Label />} size="small" label="Sample Tag1" />
                      <Chip icon={<Label />} size="small" label="Sample Tag2" />
                    </Stack>
                  </CardContent>
                </Grid>
                <Grid item xs={3}>
                  <Image sx={{ width: '100%', height: '100%' }} />
                </Grid>
              </Grid>
            </Card>
          </Stack>
        </Grid>
        <Grid item display={{ xs: 'none', md: 'block' }} md={3}>
          <List subheader={<ListSubheader>Folloed Users</ListSubheader>}>
            <ListItem
              secondaryAction={
                <IconButton edge="end">
                  <PersonRemove />
                </IconButton>
              }
            >
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText primary="User ID" secondary="Description" />
            </ListItem>
            <ListItem
              secondaryAction={
                <IconButton edge="end">
                  <PersonRemove />
                </IconButton>
              }
            >
              <ListItemAvatar>
                <Avatar>
                  <Person />
                </Avatar>
              </ListItemAvatar>
              <ListItemText primary="User ID" secondary="Description" />
            </ListItem>
          </List>
          <Divider />
          <List subheader={<ListSubheader>Favorite Articles</ListSubheader>}>
            <ListItem
              secondaryAction={
                <IconButton edge="end">
                  <BookmarkRemove />
                </IconButton>
              }
            >
              <ListItemIcon>
                <Image />
              </ListItemIcon>
              <ListItemText primary="Article Title" secondary="Description" />
            </ListItem>
            <ListItem
              secondaryAction={
                <IconButton edge="end">
                  <BookmarkRemove />
                </IconButton>
              }
            >
              <ListItemIcon>
                <Image />
              </ListItemIcon>
              <ListItemText primary="Article Title" secondary="Description" />
            </ListItem>
          </List>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default MyPage;

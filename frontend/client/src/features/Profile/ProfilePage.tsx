import React from 'react';
import { Grid, Card, CardContent, Typography } from '@mui/material';
import { Person } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const ProfilePage: React.FC = () => {
  return (
    <Layout>
      <Grid container justifyContent="center" pt={4}>
        <Grid item>
          <Card>
            <Grid container>
              <Grid item xs={3}>
                <Person sx={{ width: '100%', height: '100%' }} />
              </Grid>
              <Grid item xs={9}>
                <CardContent>
                  <Typography variant="h5">Sample User Profile</Typography>
                  <Typography variant="body2">Sample User Profile Detail</Typography>
                </CardContent>
              </Grid>
            </Grid>
          </Card>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default ProfilePage;

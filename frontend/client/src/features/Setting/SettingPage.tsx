import React from 'react';
import { Card, CardContent, CardHeader, Grid, TextField, Button } from '@mui/material';
import { Save, Delete } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const SettingPage: React.FC = () => {
  return (
    <Layout>
      <Grid container justifyContent="center" pt={4} textAlign="center">
        <Grid item maxWidth="sm">
          <Card>
            <CardHeader title="Setting Profile" />
            <CardContent>
              <Grid container spacing={3}>
                <Grid item xs={12}>
                  <TextField id="loginId" label="Login ID" variant="outlined" fullWidth />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    type="password"
                    id="password"
                    label="Password"
                    variant="outlined"
                    fullWidth
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    type="password"
                    id="repassword"
                    label="Retype Password"
                    variant="outlined"
                    fullWidth
                  />
                </Grid>
                <Grid item xs={12}>
                  <Button variant="contained" startIcon={<Save />} fullWidth>
                    Save
                  </Button>
                </Grid>
                <Grid item xs={12}>
                  <Button variant="contained" startIcon={<Delete />} color="error" fullWidth>
                    Delete Account
                  </Button>
                </Grid>
              </Grid>
            </CardContent>
          </Card>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default SettingPage;
